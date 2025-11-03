package com.siob_pe.siob_pe.Controller;

import com.siob_pe.siob_pe.Controller.DTO.OcorrenciaDTO;
import com.siob_pe.siob_pe.Model.Ocorrencia;
import com.siob_pe.siob_pe.Model.SituacaoOcorrencia;
import com.siob_pe.siob_pe.Service.OcorrenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController implements GenericController {

    private final OcorrenciaService ocorrenciaService;

    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody OcorrenciaDTO ocorrenciaDTO) {
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setId(ocorrenciaDTO.id());
        ocorrencia.setAis(ocorrenciaDTO.ais());
        ocorrencia.setCodigoLocalOcorrencia(ocorrenciaDTO.codigoLocalOcorrencia());
        ocorrencia.setBairro(ocorrenciaDTO.bairro());
        ocorrencia.setDiretoria(ocorrenciaDTO.diretoria());
        ocorrencia.setSubgrupoOcorrencia(ocorrenciaDTO.subgrupoOcorrencia());
        ocorrencia.setGrupamento(ocorrenciaDTO.grupamento());
        ocorrencia.setLogradouro(ocorrenciaDTO.logradouro());
        ocorrencia.setMunicipio(ocorrenciaDTO.municipio());
        ocorrencia.setDataHoraAcionamento(ocorrenciaDTO.dataHoraAcionamento());
        ocorrencia.setFormaAcionamento(ocorrenciaDTO.formaAcionamento());
        ocorrencia.setLocalAcionamento(ocorrenciaDTO.localAcionamento());
        ocorrencia.setNumeroAviso(ocorrenciaDTO.numeroAviso());
        ocorrencia.setNumeroViatura(ocorrenciaDTO.numeroViatura());
        ocorrencia.setViaturaEmpregada(ocorrenciaDTO.viaturaEmpregada());
        ocorrencia.setPontoBase(ocorrenciaDTO.pontoBase());
        ocorrencia.setRegiao(ocorrenciaDTO.regiao());
        ocorrencia.setTipoLogradouro(ocorrenciaDTO.tipoLogradouro());
        ocorrencia.setTipoNaturezaOcorrencia(ocorrenciaDTO.tipoNaturezaOcorrencia());
        ocorrencia.setSituacaoOcorrencia(SituacaoOcorrencia.EM_ANDAMENTO);
        ocorrenciaService.salvar(ocorrencia);

        URI location = gerarHeaderLocation(ocorrencia.getId());

        return ResponseEntity.created(location).build();

    }


}
