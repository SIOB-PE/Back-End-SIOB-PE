package com.siob_pe.siob_pe.Repository;

import com.siob_pe.siob_pe.Model.Ocorrencia;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OcorrenciaRepository extends MongoRepository<Ocorrencia, UUID> {
}
