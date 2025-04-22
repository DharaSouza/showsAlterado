package com.shows.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shows.Entities.shows;

public interface showsRepository extends JpaRepository<shows, Long> {
}
