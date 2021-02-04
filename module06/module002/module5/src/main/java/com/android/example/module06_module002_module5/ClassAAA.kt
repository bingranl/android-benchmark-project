package com.android.example.module06_module002_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				param0.get()

			}
			val local_var_3_0: com.android.example.module06_module337_module3.ClassAAA = com.android.example.module06_module337_module3.ClassAAA()
			local_var_3_0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.assertNotSubscribed()

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.IoScheduler,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
	}
}
