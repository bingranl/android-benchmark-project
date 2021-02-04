package com.android.example.module06_module121_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.setValue(kotlin.Any())

		param0.isDisposed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		listOf("1", "2", "3").forEach {
			param0.request(8936095298819461273)

			param0.isDisposed()

		}
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.postValue(kotlin.Any())

		param0.isDisposed()

	}
}
