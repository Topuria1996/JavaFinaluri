package com.example.nodartopuria2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddTaskDTO {
    private String title;
    private String desc;
    private Date startDate;
    private Date endDate;
}
