package com.example.hogwartsstudents.data.mapper

import com.example.hogwartsstudents.data.dto.HogwartsResponseDtoItem
import com.example.hogwartsstudents.domain.model.Hogwarts

internal fun HogwartsResponseDtoItem.toDomain(): Hogwarts {
    return Hogwarts(
        actor,
        alive,
        alternate_actors,
        alternate_names,
        ancestry,
        dateOfBirth,
        eyeColour,
        gender,
        hairColour,
        hogwartsStaff,
        hogwartsStudent,
        house,
        id,
        image,
        name,
        patronus,
        species,
        wand,
        wizard,
        yearOfBirth
    )}
