package a10_shape.be.kdg.oo.shape.geometry;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

	@Override
	public String toString() {
		return String.format("%s at (%d,%d) with perimeter %.2f and surface %.2f",
			"Square",
			x,
			y,
			getPerimeter(),
			getArea());
	}
}
