package com.solehinpower.websocketsolehin.Repository;

import com.solehinpower.websocketsolehin.model.ChatMessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageModelRepository extends JpaRepository<ChatMessageModel,Long> {
}
