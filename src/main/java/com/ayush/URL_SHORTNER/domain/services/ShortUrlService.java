package com.ayush.URL_SHORTNER.domain.services;
import com.ayush.URL_SHORTNER.domain.entities.ShortUrl;
import com.ayush.URL_SHORTNER.domain.repositories.ShortUrlRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShortUrlService {
    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    public List<ShortUrl> findAllPublicShortUrls() {
        return shortUrlRepository.findPublicShortUrls();
    }
}
