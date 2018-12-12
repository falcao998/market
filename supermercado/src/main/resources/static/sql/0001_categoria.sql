-- Table: public.categoria

-- DROP TABLE public.categoria;

CREATE TABLE public.categoria
(
  id serial NOT NULL ,
  nome character varying(50) NOT NULL,
  CONSTRAINT categoria_pkey PRIMARY KEY (id),
  CONSTRAINT categoria_nome_key UNIQUE (nome)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.categoria
  OWNER TO postgres;
