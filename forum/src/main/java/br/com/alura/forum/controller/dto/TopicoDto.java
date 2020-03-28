package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Resposta;
import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TopicoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;

	//public TopicoDto(Topico topico) {
	//	this.id = topico.getId();
	//	this.titulo = topico.getTitulo();
	//	this.mensagem = topico.getMensagem();
	//	this.dataCriacao = topico.getDataCriacao();
	//}

	public static List<TopicoDto> converter(List<Topico> topicos) {
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList()); // simula o for java 8
	}

	

}

//public static List<TopicoDto> converter(List<Topico> topicos) {
//return topicos.stream().map(TopicoDto::new).collect(Collectors.toList()); // simula o for java 8
//}
