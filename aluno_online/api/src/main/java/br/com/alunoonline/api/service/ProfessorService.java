package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public void criarProfessor (Professor professor) {
        professorRepository.save(professor);
    }

    public List<Professor> listarTodosProfessores(){
        return professorRepository.findAll();
    }

    public Optional<Professor> buscarProfessorPorId(Long id) {
        return professorRepository.findById(id);
    }

    public void deletarProfessorPorId(Long id) {
        professorRepository.deleteById(id);
    }

    public void atualizarProfessorPorId(Long id, Professor professor) {
        // PRIMEIRO PASSO: VER SE O PROFESSOR EXISTE NO BD
        Optional<Professor> professorBancoDeDados = buscarProfessorPorId(id);

        // E SE NÃO EXISTIR???
        if (professorBancoDeDados.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Professor não encontrado no banco de dados");
        }

        // SE CHEGAR AQUI, SIGNIFICA QUE EXISTE PROFESSOR! ENTÃO
        // VOU ARMAZENA-LO EM UMA VARIAVEL
        Professor professorEditado = professorBancoDeDados.get();

        // COM ESSE PROFESSOR EDITADO DE CIMA, FAÇO
        // OS SETS NECESSARIOS PARA ATUALIZAR OS ATRIBUTOS DELE
        professorEditado.setNome(professor.getNome());
        professorEditado.setCPF(professor.getCPF());
        professorEditado.setEmail(professor.getEmail());

        // COM O PROFESSOR TOTALMENTE EDITADO ACIMA
        // EU DEVOLVO ELE EDITADO/ATUALIZADO PARA O BANCO DE DADOS
        professorRepository.save(professorEditado);
    }
}
