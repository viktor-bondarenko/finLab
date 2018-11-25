import json
from logging.config import dictConfig

from flask import Flask, render_template

dictConfig({
    'version': 1,
    'formatters': {'default': {
        'format': '[%(asctime)s] %(levelname)s in %(module)s: %(message)s',
    }},
    'handlers': {'wsgi': {
        'class': 'logging.StreamHandler',
        'stream': 'ext://sys.stdout',
        'formatter': 'default'
    },
        'file': {
            'class': 'logging.handlers.RotatingFileHandler',
            'filename': 'portal.log',
            'formatter': 'default',
            'maxBytes': 1024 * 1024 * 10,
            'backupCount': 10
        }},
    'root': {
        'level': 'DEBUG',
        'handlers': ['wsgi', 'file']
    }
})

app = Flask(__name__)


@app.route("/records", methods=['GET'])
def index():
    with open('data/data.json') as f:
        data = json.load(f)
    print(data)
    return json.dumps(data, indent=4)

if __name__ == '__main__':
    app.run(host="0.0.0.0", port=5000)