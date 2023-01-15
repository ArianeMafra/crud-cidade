package br.com.ada.crud.controller.impl;

import br.com.ada.crud.controller.CidadeController;
import br.com.ada.crud.model.Cidade;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CidadeArmazenamentoVolatilController implements CidadeController {

    private Map<UUID, Cidade> cidades = new HashMap<>();

    @Override
    public void cadastrar(Cidade cidade) {
        cidade.setId(UUID.randomUUID());
        cidades.put(cidade.getId(), cidade);
    }
}
