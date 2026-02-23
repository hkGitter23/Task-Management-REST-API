package codes.taskmanhk.my_spring_project.repository;

import codes.taskmanhk.my_spring_project.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
