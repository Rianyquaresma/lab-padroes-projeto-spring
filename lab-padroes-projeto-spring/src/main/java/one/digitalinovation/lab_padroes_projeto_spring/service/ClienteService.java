package one.digitalinovation.lab_padroes_projeto_spring.service;

import one.digitalinovation.lab_padroes_projeto_spring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy<b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações
 * desssa mesma interface.
 */

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
