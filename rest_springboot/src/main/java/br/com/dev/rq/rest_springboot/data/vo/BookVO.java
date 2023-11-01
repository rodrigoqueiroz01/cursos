package br.com.dev.rq.rest_springboot.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "author", "launchDate", "price", "title"})
public class BookVO extends RepresentationModel<BookVO> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("autor")
    private String author;

    @JsonProperty("dataLancamento")
    private Date launchDate;

    @JsonProperty("preco")
    private Double price;

    @JsonProperty("titulo")
    private String title;

}
