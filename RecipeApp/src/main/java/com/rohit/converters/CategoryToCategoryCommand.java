package com.rohit.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import com.rohit.commands.CategoryCommand;
import com.rohit.domain.Category;

import lombok.Synchronized;

public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

	@Synchronized
	@Nullable
	@Override
	public CategoryCommand convert(Category source) {
		
		if(source == null) {
			return null;
		}
		
		final CategoryCommand categoryCommand = new CategoryCommand();
		
		categoryCommand.setId(source.getId());
		categoryCommand.setDescription(source.getDescription());
		
		return categoryCommand;
	}

	
}
