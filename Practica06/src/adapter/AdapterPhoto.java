package adapter;

import components.Coordinates;
import model.Photo;
import views.MapElement;

public class AdapterPhoto implements MapElement {

	Photo photo;

	public AdapterPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String getName() {
		return photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return photo.getCoordinates();
	}

	@Override
	public String getTooltipInfo() {
		return photo.getDescription() + " - " + photo.getUser();
	}

	@Override
	public void open() {
		photo.show();
	}

}
