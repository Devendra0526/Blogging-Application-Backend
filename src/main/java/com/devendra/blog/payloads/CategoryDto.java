package com.devendra.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	
	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message = "Title size is min 4 characters")
	private String categoryTitle;
	
	@NotBlank
	@Size(max = 10, message = "Description seze not more than 10 characters")
	private String categoryDescription;
}
