FROM postgres

ENV POSTGRES_DB=${POSTGRES_DB}
ENV POSTGRES_USER=${POSTGRES_USER}
ENV POSTGRES_PASSWORD=${POSTGRES_PASSWORD}

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD pg_isready -U ${POSTGRES_USER}