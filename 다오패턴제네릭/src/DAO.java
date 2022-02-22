import java.util.List;
public interface DAO<D, K> {//제네릭을 쓸때는 한글자씩 쓰는게 나음 DATA =D, KEY =K
    public void insert(D data);//PasswordInfo 를 D로 바꾸기
    public List<D> findAll();
    public D findByKey(K key); //url을 key로 변경 보기좋게, String를 K로 바꾸기
    public void update(K key, D data);//p 는 보기좋게 data로.
    public void deleteByKey(K key);
    public void delete(D data);
}
