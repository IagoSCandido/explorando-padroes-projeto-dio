package dio.explorandopadroesdeprojeto.service;

import dio.explorandopadroesdeprojeto.model.Cliente;
import dio.explorandopadroesdeprojeto.model.Endereco;

public interface ClienteService {

    Iterable<Endereco> buscarTodos();

    Endereco buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
