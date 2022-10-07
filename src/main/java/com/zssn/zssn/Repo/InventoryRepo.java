package com.zssn.zssn.Repo;

import com.zssn.zssn.models.Inventory;
import com.zssn.zssn.models.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {
}
