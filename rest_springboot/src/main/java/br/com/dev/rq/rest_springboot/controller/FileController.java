package br.com.dev.rq.rest_springboot.controller;

import br.com.dev.rq.rest_springboot.controller.interfaces.IFileController;
import br.com.dev.rq.rest_springboot.data.vo.UploadFileResponseVO;
import br.com.dev.rq.rest_springboot.exception.FileStorageException;
import br.com.dev.rq.rest_springboot.service.FileStorageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
@RequestMapping("/api/file/v1")
public class FileController implements IFileController {

    private final FileStorageService service;

    @PostMapping("/uploadFile")
    public UploadFileResponseVO uploadFile(@RequestParam("file")MultipartFile file) {
        var filename = service.storeFile(file);
        var fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/v1/downloadFile/").path(filename).toUriString();
        return new UploadFileResponseVO(filename, fileDownloadUri, file.getContentType(), String.valueOf(file.getSize()));
    }

    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponseVO> uploadMultipleFiles(@RequestParam("files")MultipartFile[] files) {
        return Stream.of(files).map(this::uploadFile).collect(Collectors.toList()) ;
    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        var resource = service.loadFileAsResource(fileName);
        var contentType = "";

        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (Exception e) {
            throw new FileStorageException("Não foi possível determinar o tipo de arquivo!", e);
        }

        if (contentType.isBlank()) contentType = "application/octet-stream";

        return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

}
