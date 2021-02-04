package com.android.example.module06_module017_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.assertNotSubscribed()

		} else {
			param0.cancel()

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertSubscribed()

		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.setValue(kotlin.Any())

		val local_var_2_3: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_3.postValue(kotlin.Any())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.requestMore(7547170548208350719)

		val local_var_2_1: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_1.clear()

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

	}

	fun method3(
		param0: io.reactivex.internal.schedulers.NewThreadScheduler,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.schedulers.TestScheduler,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.createWorker()

		val local_var_2_4: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_4.setValue(kotlin.Any())

	}

	fun method4(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.internal.schedulers.SingleScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		param0.isDisposed()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.exit()

	}
}
