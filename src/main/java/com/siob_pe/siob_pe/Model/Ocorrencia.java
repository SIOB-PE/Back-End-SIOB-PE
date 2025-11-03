package com.siob_pe.siob_pe.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "Ocorrencia")
public class Ocorrencia {

    @Id
    private String id;
    private String diretoria;
    private String viaturaEmpregada;
    private String numeroAviso;
    private String numeroViatura;
    private String codigoLocalOcorrencia;
    private String grupamento;
    private LocalDateTime dataHoraAcionamento;
    private String pontoBase;
    private String formaAcionamento;
    private String localAcionamento;
    private String regiao;
    private String ais;
    private String municipio;
    private String bairro;
    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private TipoNaturezaOcorrencia tipoNaturezaOcorrencia;
    private String subgrupoOcorrencia;
    private SituacaoOcorrencia situacaoOcorrencia;
}
