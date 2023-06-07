package com.donatii.donatiiapi.service.interfaces;

import com.donatii.donatiiapi.model.TagAnimal;

public interface ITagAnimalService {
    /**
     * Obtine toate tagurle
     * @return Lista de taguri
     */
    Iterable<TagAnimal> getTags();
}
