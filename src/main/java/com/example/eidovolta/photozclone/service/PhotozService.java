package com.example.eidovolta.photozclone.service;

import java.util.Collection;
import org.springframework.stereotype.Service;

import com.example.eidovolta.photozclone.model.Photo;
import com.example.eidovolta.photozclone.repository.PhotozRepository;

@Service
public class PhotozService {
	private final PhotozRepository photozRepository;
	
	public PhotozService(PhotozRepository photozRepository) {
		this.photozRepository = photozRepository;
	}

	public Collection<Photo> get() {
		return (Collection<Photo>) photozRepository.findAll();
	}

	public Photo get(Integer id) {
		return photozRepository.findById(id).orElse(null);
	}

	public void remove(Integer id) {
		photozRepository.deleteById(id);
	}

	public Photo save(String fileName, String contentType, byte[] data) {
		Photo photo = new Photo();
		photo.setFileName(fileName);
		photo.setContentType(contentType);
		photo.setData(data);
		photozRepository.save(photo);
		return photo;
	}
}
