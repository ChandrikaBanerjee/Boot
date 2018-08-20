package com.demo.rest.names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NamesService {
	private List<NamesInput> names = new ArrayList<>(
			Arrays.asList(new NamesInput(1, "A"), new NamesInput(2, "B"), new NamesInput(3, "C")));

	public List<NamesInput> getAllNames() {
		return names;
	}

	public NamesInput getName(int id) {
	return names.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	public void addName(NamesInput name)

	{
		names.add(name);

	}

	public void updateName(int id,NamesInput name) {
		for(int i=0;i<names.size();i++)
		{
			NamesInput n=names.get(i);
			if(n.getId()==id)
			{
				names.set(i, name);		
				return;
				}
		}
		
	}

	public void deleteName(int id) {
		names.removeIf(t -> t.getId() == id);
	}
}
