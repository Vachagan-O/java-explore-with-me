package ru.practicum.main_service.user.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    @Size(min = 6, max = 254)
    String email;
    Long id;
    @Size(min = 2, max = 250)
    String name;
}
