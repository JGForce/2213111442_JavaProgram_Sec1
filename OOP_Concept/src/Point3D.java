
public class Point3D extends Point2D {
		private float z;
	
		public Point3D() {
				super();
				this.z = 0;
		}
		
		public Point3D(float x,float y,float z) {
				super(x,y);
				this.z = z;
		}
		
		public float getZ() {
				return z;
		}
		
		public void setZ(int z) {
				this.z = z;
		}
		
		public void setXYZ(float x, float y, float z) {
				super.setX(x);
				super.setY(y);
				this.z = z;
		}
		
		public float[] getXYZ() {
				float[] results = new float[3];
				results[0] = super.getX();
				results[1] = super.getX();
				results[2] = this.z;
				return results;
		}
		
		@Override
		public String toString() {
				return super.toString() + ", and" + getZ() + ")";
		}

	}

