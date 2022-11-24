package com.niimto.automation.entity.researchactivity.research;


import com.niimto.automation.entity.researchactivity.group.Group;
import com.niimto.automation.entity.researchactivity.stage.Stage;
import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "researches")
public class Research {

    @Id
    @Column(name = "research_id", nullable = false)
    @NotNull
    private UUID researchId;

    @Column(name = "research_date_from", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;

    @Column(name = "research_date_to", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateTo;

    @Column(name = "research_name", nullable = false, unique = true)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "research", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Stage> stageList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "groups_group_id", referencedColumnName = "group_id")
    private Group group;

    public Research() {
    }

    public UUID getResearchId() {
        return researchId;
    }

    public void setResearchId(UUID researchId) {
        this.researchId = researchId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stage> getStageList() {
        return stageList;
    }

    public void setStageList(List<Stage> stageList) {
        this.stageList = stageList;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Research)) return false;

        Research research = (Research) o;

        if (!getResearchId().equals(research.getResearchId())) return false;
        return getName().equals(research.getName());
    }

    @Override
    public int hashCode() {
        int result = getResearchId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Research{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", name='" + name + '\'' +
                '}';
    }
}
