package fluff.math._float.vec;

public abstract class AbstractFloatVec4<V extends AbstractFloatVec4<V>> implements IFloatVec<V> {
	
	protected abstract float getX();
	
	protected abstract float getY();
	
	protected abstract float getZ();
	
	protected abstract float getW();
	
	protected abstract void set(float x, float y, float z, float w);
	
	@Override
	public V add(V vec) {
		set(
				getX() + vec.getX(),
				getY() + vec.getY(),
				getZ() + vec.getZ(),
				getW() + vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V subtract(V vec) {
		set(
				getX() - vec.getX(),
				getY() - vec.getY(),
				getZ() - vec.getZ(),
				getW() - vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V multiply(V vec) {
		set(
				getX() * vec.getX(),
				getY() * vec.getY(),
				getZ() * vec.getZ(),
				getW() * vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V divide(V vec) {
		set(
				getX() / vec.getX(),
				getY() / vec.getY(),
				getZ() / vec.getZ(),
				getW() / vec.getW()
				);
		return (V) this;
	}
	
	@Override
	public V abs() {
		set(
				Math.abs(getX()),
				Math.abs(getY()),
				Math.abs(getZ()),
				Math.abs(getW())
				);
		return (V) this;
	}
	
	@Override
	public V negate() {
		set(
				-getX(),
				-getY(),
				-getZ(),
				-getW()
				);
		return (V) this;
	}
	
	@Override
	public double length() {
		return Math.sqrt(
				getX() * getX() +
				getY() * getY() +
				getZ() * getZ() +
				getW() * getW()
				);
	}
	
	@Override
	public boolean isInside(V min, V max) {
		return getX() >= min.getX() && getX() <= max.getX() &&
				getY() >= min.getY() && getY() <= max.getY() &&
				getZ() >= min.getZ() && getZ() <= max.getZ() &&
				getW() >= min.getW() && getW() <= max.getW()
				;
	}
	
	@Override
	public V add(float val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val,
				getW() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(float val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val,
				getW() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(float val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val,
				getW() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(float val) {
		set(
				getX() / val,
				getY() / val,
				getZ() / val,
				getW() / val
				);
		return (V) this;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ", " + getW() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractFloatVec4 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY() &&
					getZ() == vec.getZ() &&
					getW() == vec.getW()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + Float.floatToIntBits(getX());
		bits = 31L * bits + Float.floatToIntBits(getY());
		bits = 31L * bits + Float.floatToIntBits(getZ());
		bits = 31L * bits + Float.floatToIntBits(getW());
		return (int) (bits ^ bits >> 32);
	}
}
