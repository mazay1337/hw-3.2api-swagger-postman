package proskyhw3v2apiswaggerpostman.service;

import proskyhw3v2apiswaggerpostman.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(Faculty faculty);

    Faculty deleteFaculty(long id);
    public Collection<Faculty > findByColor(String color);

}
