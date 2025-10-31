package com.siob_pe.siob_pe.Service;

import com.siob_pe.siob_pe.Model.Ocorrencia;
import com.siob_pe.siob_pe.Repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService {

    private final OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public void salvar(Ocorrencia ocorrencia){
        ocorrenciaRepository.save(ocorrencia);
    }
}
