package com.rohit.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.rohit.commands.CategoryCommand;
import com.rohit.domain.Category;

import lombok.Synchronized;

public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

	@Synchronized
	@Nullable
	@Override
	public Category convert(CategoryCommand source) {
		
		if(source == null) {
			return null;
		}
		
		final Category category = new Category();
		category.setId(source.getId());
		category.setDescription(source.getDescription());
		return category;
	}

}
