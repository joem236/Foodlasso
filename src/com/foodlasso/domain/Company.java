package com.foodlasso.domain;
import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="company_tbl")
public class Company implements Serializable {
	private static final long serialVersionUID = 2963558076169561794L;
	private int id;
	private String factualId;
	private String name;
	private String address;
	private String locality;
	private String region;
	private String country;
	private String postcode;
	private String tel;
	private String category;
	private String website;
	private Double latitude;
	private Double longitude;
	private String alcohol;
	private String takeout;
	private String delivery;
	private String alcohol_bool;
	private String distance;
	private String parking;
	private String good_for_kids;
	private String cash_only;
	private String parking_bool;
	private String meals;
	private String lunch;
	private String dinner;
	private String bar;
	private String parking_garage;
	private String parking_good;
	private String parking_lot;
	private String email;
	private String parking_free;
	private String breakfast;
	private String vegan_options;
	private String vegetarian_options;
	private String wifi;
	private String alcohol_beer_wine;
	private String address_extended;
	private String reservations;
	private String alcohol_byob;
	private String wheelchair_access;
	private int rating;
	private int price;
	private int reviews;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	
	@Column(name="factual_id")
	public final String getFactualId() {
		return factualId;
	}
	public final void setFactualId(String factualId) {
		this.factualId = factualId;
	}
	
	@Column(name="name")
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	
	@Column(name="address")
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="locality")
	public final String getLocality() {
		return locality;
	}
	public final void setLocality(String locality) {
		this.locality = locality;
	}
	
	@Column(name="region")
	public final String getRegion() {
		return region;
	}
	public final void setRegion(String region) {
		this.region = region;
	}
	
	@Column(name="country")
	public final String getCountry() {
		return country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="postcode")
	public final String getPostcode() {
		return postcode;
	}
	public final void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	@Column(name="tel")
	public final String getTel() {
		return tel;
	}
	public final void setTel(String tel) {
		this.tel = tel;
	}
	
	@Column(name="category")
	public final String getCategory() {
		return category;
	}
	public final void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name="website")
	public final String getWebsite() {
		return website;
	}
	public final void setWebsite(String website) {
		this.website = website;
	}
	
	@Column(name="latitude")
	public final Double getLatitude() {
		return latitude;
	}
	public final void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	@Column(name="longitude")
	public final Double getLongitude() {
		return longitude;
	}
	public final void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	@Column(name="alcohol")
	public final String getAlcohol() {
		return alcohol;
	}
	public final void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	
	@Column(name="takeout")
	public final String getTakeout() {
		return takeout;
	}
	public final void setTakeout(String takeout) {
		this.takeout = takeout;
	}
	
	@Column(name="delivery")
	public final String getDelivery() {
		return delivery;
	}
	public final void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	
	@Column(name="alcohol_bool")
	public final String getAlcohol_bool() {
		return alcohol_bool;
	}
	public final void setAlcohol_bool(String alcohol_bool) {
		this.alcohol_bool = alcohol_bool;
	}
	
	@Column(name="distance")
	public final String getDistance() {
		return distance;
	}
	public final void setDistance(String distance) {
		this.distance = distance;
	}
	
	@Column(name="parking")
	public final String getParking() {
		return parking;
	}
	public final void setParking(String parking) {
		this.parking = parking;
	}
	
	@Column(name="good_for_kids")
	public final String getGood_for_kids() {
		return good_for_kids;
	}
	public final void setGood_for_kids(String good_for_kids) {
		this.good_for_kids = good_for_kids;
	}
	
	@Column(name="cash_only")
	public final String getCash_only() {
		return cash_only;
	}
	public final void setCash_only(String cash_only) {
		this.cash_only = cash_only;
	}
	
	@Column(name="parking_bool")
	public final String getParking_bool() {
		return parking_bool;
	}
	public final void setParking_bool(String parking_bool) {
		this.parking_bool = parking_bool;
	}
	
	@Column(name="meals")
	public final String getMeals() {
		return meals;
	}
	public final void setMeals(String meals) {
		this.meals = meals;
	}
	
	@Column(name="lunch")
	public final String getLunch() {
		return lunch;
	}
	public final void setLunch(String lunch) {
		this.lunch = lunch;
	}
	
	@Column(name="dinner")
	public final String getDinner() {
		return dinner;
	}
	public final void setDinner(String dinner) {
		this.dinner = dinner;
	}
	
	@Column(name="bar")
	public final String getBar() {
		return bar;
	}
	public final void setBar(String bar) {
		this.bar = bar;
	}
	
	@Column(name="parking_garage")
	public final String getParking_garage() {
		return parking_garage;
	}
	public final void setParking_garage(String parking_garage) {
		this.parking_garage = parking_garage;
	}
	
	@Column(name="parking_good")
	public final String getParking_good() {
		return parking_good;
	}
	public final void setParking_good(String parking_good) {
		this.parking_good = parking_good;
	}
	
	@Column(name="parking_lot")
	public final String getParking_lot() {
		return parking_lot;
	}
	public final void setParking_lot(String parking_lot) {
		this.parking_lot = parking_lot;
	}
	
	@Column(name="email")
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="parking_free")
	public final String getParking_free() {
		return parking_free;
	}
	public final void setParking_free(String parking_free) {
		this.parking_free = parking_free;
	}
	
	@Column(name="breakfast")
	public final String getBreakfast() {
		return breakfast;
	}
	public final void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	
	@Column(name="vegan_options")
	public final String getVegan_options() {
		return vegan_options;
	}
	public final void setVegan_options(String vegan_options) {
		this.vegan_options = vegan_options;
	}
	
	@Column(name="vegetarian_options")
	public final String getVegetarian_options() {
		return vegetarian_options;
	}
	public final void setVegetarian_options(String vegetarian_options) {
		this.vegetarian_options = vegetarian_options;
	}
	
	@Column(name="wifi")
	public final String getWifi() {
		return wifi;
	}
	public final void setWifi(String wifi) {
		this.wifi = wifi;
	}
	
	@Column(name="alcohol_beer_wine")
	public final String getAlcohol_beer_wine() {
		return alcohol_beer_wine;
	}
	public final void setAlcohol_beer_wine(String alcohol_beer_wine) {
		this.alcohol_beer_wine = alcohol_beer_wine;
	}
	
	@Column(name="address_extended")
	public final String getAddress_extended() {
		return address_extended;
	}
	public final void setAddress_extended(String address_extended) {
		this.address_extended = address_extended;
	}
	
	@Column(name="reservations")
	public final String getReservations() {
		return reservations;
	}
	public final void setReservations(String reservations) {
		this.reservations = reservations;
	}
	
	@Column(name="alcohol_byob")
	public final String getAlcohol_byob() {
		return alcohol_byob;
	}
	public final void setAlcohol_byob(String alcohol_byob) {
		this.alcohol_byob = alcohol_byob;
	}
	
	@Column(name="wheelchair_access")
	public final String getWheelchair_access() {
		return wheelchair_access;
	}
	public final void setWheelchair_access(String wheelchair_access) {
		this.wheelchair_access = wheelchair_access;
	}
	
	@Column(name="rating")
	public final int getRating() {
		return rating;
	}
	public final void setRating(int rating) {
		this.rating = rating;
	}
	
	@Column(name="price")
	public final int getPrice() {
		return price;
	}
	public final void setPrice(int price) {
		this.price = price;
	}
	
	@Column(name="reviews")
	public final int getReviews() {
		return reviews;
	}
	public final void setReviews(int reviews) {
		this.reviews = reviews;
	}
}
