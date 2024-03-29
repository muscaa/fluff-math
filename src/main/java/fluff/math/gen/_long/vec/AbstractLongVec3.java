package fluff.math.gen._long.vec;

public abstract class AbstractLongVec3<V extends AbstractLongVec3<V>> implements ILongVec<V> {
	
	protected abstract long getX();
	
	protected abstract long getY();
	
	protected abstract long getZ();
	
	protected abstract void set(long x, long y, long z);
	
	@Override
	public V add(V vec) {
		set(
				getX() + vec.getX(),
				getY() + vec.getY(),
				getZ() + vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V subtract(V vec) {
		set(
				getX() - vec.getX(),
				getY() - vec.getY(),
				getZ() - vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V multiply(V vec) {
		set(
				getX() * vec.getX(),
				getY() * vec.getY(),
				getZ() * vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V divide(V vec) {
		set(
				getX() / vec.getX(),
				getY() / vec.getY(),
				getZ() / vec.getZ()
				);
		return (V) this;
	}
	
	@Override
	public V abs() {
		set(
				Math.abs(getX()),
				Math.abs(getY()),
				Math.abs(getZ())
				);
		return (V) this;
	}
	
	@Override
	public V negate() {
		set(
				-getX(),
				-getY(),
				-getZ()
				);
		return (V) this;
	}
	
	@Override
	public double length() {
		return Math.sqrt(
				getX() * getX() +
				getY() * getY() +
				getZ() * getZ()
				);
	}
	
	@Override
	public boolean isInside(V min, V max) {
		return getX() >= min.getX() && getX() <= max.getX() &&
				getY() >= min.getY() && getY() <= max.getY() &&
				getZ() >= min.getZ() && getZ() <= max.getZ()
				;
	}
	
	@Override
	public V add(long val) {
		set(
				getX() + val,
				getY() + val,
				getZ() + val
				);
		return (V) this;
	}
	
	@Override
	public V subtract(long val) {
		set(
				getX() - val,
				getY() - val,
				getZ() - val
				);
		return (V) this;
	}
	
	@Override
	public V multiply(long val) {
		set(
				getX() * val,
				getY() * val,
				getZ() * val
				);
		return (V) this;
	}
	
	@Override
	public V divide(long val) {
		set(
				getX() / val,
				getY() / val,
				getZ() / val
				);
		return (V) this;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractLongVec3 vec) {
			return getX() == vec.getX() &&
					getY() == vec.getY() &&
					getZ() == vec.getZ()
					;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + getX();
		bits = 31L * bits + getY();
		bits = 31L * bits + getZ();
		return (int) (bits ^ bits >> 32);
	}
}
