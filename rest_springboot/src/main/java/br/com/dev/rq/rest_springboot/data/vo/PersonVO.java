package br.com.dev.rq.rest_springboot.data.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({"id", "firstName", "lastName", "address", "document", "gender", "enabled"})
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String firstName;

    @JsonProperty("sobrenome")
    private String lastName;

    @JsonProperty("endereco")
    private String address;

    @JsonProperty("cpf")
    private String document;

    @JsonProperty("genero")
    private String gender;

    @JsonProperty("habilitado")
    private Boolean enabled;

}
