package lesson3;

public class Dep {
	int depId;
	String depName;
	@Override
	public String toString() {
		return "Dep [depId=" + depId + ", depName=" + depName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depId;
		result = prime * result + ((depName == null) ? 0 : depName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dep other = (Dep) obj;
		
		if (depName == null) {
			if (other.depName != null)
				return false;
		} else if (!depName.equals(other.depName))
			return false;
		return true;
	}
	
	
}
