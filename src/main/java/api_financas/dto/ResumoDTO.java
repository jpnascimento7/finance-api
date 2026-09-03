package api_financas.dto;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ResumoDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.00")
    private BigDecimal totalReceitas;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.00")
    private BigDecimal totalDespesas;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.00")
    private BigDecimal saldo;

    public ResumoDTO (BigDecimal totalReceitas, BigDecimal totalDespesas, BigDecimal saldo){
        this.totalReceitas = totalReceitas;
        this.totalDespesas = totalDespesas;
        this.saldo = saldo;
    }

    public BigDecimal getTotalReceitas() {
        return totalReceitas;
    }

    public BigDecimal getTotalDespesas() {
        return totalDespesas;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
