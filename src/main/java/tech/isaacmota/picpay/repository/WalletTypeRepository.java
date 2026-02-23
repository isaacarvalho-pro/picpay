package tech.isaacmota.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.isaacmota.picpay.entity.WalletType;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}
