package si.meshetr.adrealestate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="t_ad_realestate")
public class RealEstateAd {
    @Id
    Long idAd;

    @Column
    String idUser;

    @Column
    String title;

    @Column
    String description;

    @Column
    String region;

    @Column
    double surface;

    @Column
    double latitude;

    @Column
    double longitude;

    @Column
    double price;

    @Column
    LocalDateTime createdAt;

    @Column
    LocalDateTime updatedAt;

    public RealEstateAd(Long idAd, String idUser, String title, String description, String region, double surface, double latitude, double longitude, double price) {
        this.idAd = idAd;
        this.idUser = idUser;
        this.title = title;
        this.description = description;
        this.region = region;
        this.surface = surface;
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
    }

    public RealEstateAd() {
        super();
    }

    public Long getIdAd() {
        return idAd;
    }

    public void setIdAd(Long idAd) {
        this.idAd = idAd;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
