package entity;

import java.util.List;

/**
 * @author 刘  杨
 * @date 2020-12-21 14:09
 */

/**
 * 分页结果类
 * @param <T>
 */
public class PageResult<T> {
    private long total;
    private List<T> rows;

    public PageResult(long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
