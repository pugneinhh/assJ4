package model;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ChucVu")
@ToString
public class ChucVu {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name="Id")
    private String id;
    @Column(name="Ma")
    private String ma;
    @Column(name="Ten")
    private String ten;

    public ChucVu() {
    }

    public ChucVu(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
