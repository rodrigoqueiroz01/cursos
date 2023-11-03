package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.config.FileStorageConfig;
import br.com.dev.rq.rest_springboot.exception.FileStorageException;
import br.com.dev.rq.rest_springboot.exception.MyFileNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;

    public FileStorageService(FileStorageConfig fileStorageConfig) {
        this.fileStorageLocation = Paths.get(fileStorageConfig.getUploadDir()).toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception e) {
            throw new FileStorageException("Não foi possível criar o diretório onde os arquivos enviados serão armazenados!", e);
        }
    }

    public String storeFile(MultipartFile file) {
        var filename = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (filename.contains("..")) throw new FileStorageException("Desculpe! O nome do arquivo contém sequências de caminho inválidas.");
            var targetLocation = this.fileStorageLocation.resolve(filename);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return filename;
        } catch (Exception e) {
            throw new FileStorageException("Não foi possível armazenar o arquivo" + filename + " Por favor, tente novamente!", e);
        }
    }

    public Resource loadFileAsResource(String filename) {
        try {
            var filePath = this.fileStorageLocation.resolve(filename).normalize();
            var resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("Arquivo não encontrado");
            }
        } catch (Exception e) {
            throw new MyFileNotFoundException("" + filename, e);
        }
    }

}
