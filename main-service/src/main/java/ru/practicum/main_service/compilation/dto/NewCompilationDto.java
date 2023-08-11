package ru.practicum.main_service.compilation.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main_service.MainCommonUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NewCompilationDto {
    @NotBlank
    @Size(min = 1, max = 50)
    String title;

    Boolean pinned = false;
    List<Long> events = new ArrayList<>();
}
