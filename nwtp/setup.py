from setuptools import setup

setup(name='net worth tracker',
      version='0.1',
      description='net worth tracker',
      url='http://github.com/storborg/funniest',
      author='vic',
      author_email='some@example.com',
      license='MIT',
      packages=['nwt'],
      install_requires=[
          'flask',
      ],
      zip_safe=False)