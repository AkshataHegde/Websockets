package com.solehinpower.websocketsolehin.Repository;

import com.solehinpower.websocketsolehin.model.ChatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatModelRepository extends JpaRepository<ChatModel,Long> {
}
