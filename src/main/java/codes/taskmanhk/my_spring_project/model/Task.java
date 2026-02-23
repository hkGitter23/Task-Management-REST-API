package codes.taskmanhk.my_spring_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String subject;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Priority priority;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status = Status.NOT_STARTED;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime dueDate;

    protected Task() {}

    public Task(String subject, Priority priority, Status status,
                LocalDateTime startDate, LocalDateTime dueDate) {
        this.subject = subject;
        this.priority = priority;
        this.status = (status == null) ? Status.NOT_STARTED : status;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public Long getId() { return id; }
    public String getSubject() { return subject; }
    public Priority getPriority() { return priority; }
    public Status getStatus() { return status; }
    public LocalDateTime getStartDate() { return startDate; }
    public LocalDateTime getDueDate() { return dueDate; }

    public void setSubject(String subject) { this.subject = subject; }
    public void setPriority(Priority priority) { this.priority = priority; }
    public void setStatus(Status status) { this.status = status; }
    public void setStartDate(LocalDateTime startDate) { this.startDate = startDate; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }
}
