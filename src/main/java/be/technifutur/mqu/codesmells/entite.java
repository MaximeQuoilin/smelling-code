package be.technifutur.mqu.codesmells;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name="tuser")
public class entite {
    @Id@Column(name="id")Integer id;
}
