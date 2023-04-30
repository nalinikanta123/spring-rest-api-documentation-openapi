package com.dream.thoughts.springrestapidocumentationopenapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Book object")
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@JsonProperty(value = "id", required = true, index = 10)
	@Schema(description = "Unique identifier of the Book.", example = "1", required = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@JsonProperty(value = "title", required = true, index = 20)
	@Schema(description = "Name of the title.", example = "Java", required = true)
	@NotBlank
	@Size(min = 0, max = 20)
	@Column(name = "title", nullable = false)
	private String title;
	@JsonProperty(value = "author", required = true, index = 30)
	@Schema(description = "Name of the author.", example = "Max Abi", required = true)
	@NotBlank
	@Size(min = 0, max = 30)
	@Column(name = "author", nullable = false)
	private String author;
}
