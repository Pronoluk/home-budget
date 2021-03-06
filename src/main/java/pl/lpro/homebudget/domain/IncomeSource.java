package pl.lpro.homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Income_Source")
public class IncomeSource {

    private Long id;

    private String incomeName;

    private LocalDateTime creationDateTime;

    private boolean deleted;

    public IncomeSource() {
    }

    public IncomeSource(Long id, String incomeName, LocalDateTime creationDateTime, boolean deleted) {
        this.id = id;
        this.incomeName = incomeName;
        this.creationDateTime = creationDateTime;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "IncomeSource{" +
                "id=" + id +
                ", incomeName='" + incomeName + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", deleted=" + deleted +
                '}';
    }
}
