package Abstract;

public interface IBaseService<T> {
	public void add(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public void show(T entity);
}
